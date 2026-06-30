package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public final class w9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.fa f147641d;

    public w9(com.tencent.mm.plugin.luckymoney.ui.fa faVar) {
        this.f147641d = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.ui.fa faVar = this.f147641d;
        db5.t7.m(faVar.getActivity(), faVar.getActivity().getResources().getString(com.tencent.mm.R.string.lha));
    }
}
