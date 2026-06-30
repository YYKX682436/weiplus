package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f158466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.v f158467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f158468f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(boolean z17, com.tencent.mm.plugin.ringtone.uic.v vVar, android.content.Intent intent) {
        super(0);
        this.f158466d = z17;
        this.f158467e = vVar;
        this.f158468f = intent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f158466d;
        com.tencent.mm.plugin.ringtone.uic.v vVar = this.f158467e;
        if (z17) {
            db5.t7.h(vVar.getActivity(), vVar.getActivity().getResources().getString(com.tencent.mm.R.string.i2p));
        } else {
            db5.t7.g(vVar.getActivity(), vVar.getActivity().getResources().getString(com.tencent.mm.R.string.i2o));
        }
        vVar.getActivity().setResult(6, this.f158468f);
        vVar.getActivity().finish();
        return jz5.f0.f302826a;
    }
}
