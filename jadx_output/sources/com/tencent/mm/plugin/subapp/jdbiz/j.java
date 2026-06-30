package com.tencent.mm.plugin.subapp.jdbiz;

/* loaded from: classes5.dex */
public class j implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.jdbiz.JDRemindDialog f172122d;

    public j(com.tencent.mm.plugin.subapp.jdbiz.JDRemindDialog jDRemindDialog) {
        this.f172122d = jDRemindDialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f172122d.finish();
    }
}
