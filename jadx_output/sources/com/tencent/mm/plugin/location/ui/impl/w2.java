package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class w2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.q2 f144918d;

    public w2(com.tencent.mm.plugin.location.ui.impl.q2 q2Var) {
        this.f144918d = q2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f144918d.K = false;
    }
}
