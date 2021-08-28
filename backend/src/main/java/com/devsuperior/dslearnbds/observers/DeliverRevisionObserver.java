package com.devsuperior.dslearnbds.observers;

import com.devsuperior.dslearnbds.entities.Deliver;

public interface DeliverRevisionObserver {

	void onSaveRevision(Deliver deliver);
	
}
