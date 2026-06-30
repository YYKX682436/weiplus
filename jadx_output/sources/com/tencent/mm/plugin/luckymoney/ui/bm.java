package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class bm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.cm f146763d;

    public bm(com.tencent.mm.plugin.luckymoney.ui.cm cmVar) {
        this.f146763d = cmVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.cm cmVar = this.f146763d;
        db5.t7.m(cmVar.f146806c.getContext(), cmVar.f146806c.getString(com.tencent.mm.R.string.lha));
    }
}
