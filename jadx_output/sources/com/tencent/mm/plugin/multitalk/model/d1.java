package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes13.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.f1 f149905d;

    public d1(com.tencent.mm.plugin.multitalk.model.f1 f1Var) {
        this.f149905d = f1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.O(true);
        if (ym1.f.Ni()) {
            return;
        }
        this.f149905d.f149952a.R(com.tencent.mm.plugin.multitalk.model.e3.Ri().f150163f);
    }
}
