package com.tencent.mm.ui;

/* loaded from: classes.dex */
public class lb implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f209075d;

    public lb(int i17) {
        this.f209075d = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        c01.d9.b().p().w(65, java.lang.Integer.valueOf(this.f209075d + 1));
    }
}
