package com.tencent.mm.ui;

/* loaded from: classes.dex */
public class jb implements android.widget.CompoundButton.OnCheckedChangeListener {
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        if (z17) {
            c01.d9.b().p().w(4105, java.lang.Boolean.TRUE);
        } else {
            c01.d9.b().p().w(4105, java.lang.Boolean.FALSE);
        }
    }
}
