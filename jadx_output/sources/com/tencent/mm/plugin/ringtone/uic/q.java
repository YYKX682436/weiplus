package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f158458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f158459e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.v f158460f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f158461g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.ui.widget.dialog.u3 u3Var, boolean z17, com.tencent.mm.plugin.ringtone.uic.v vVar, android.content.Intent intent) {
        super(0);
        this.f158458d = u3Var;
        this.f158459e = z17;
        this.f158460f = vVar;
        this.f158461g = intent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f158458d.hide();
        boolean z17 = this.f158459e;
        com.tencent.mm.plugin.ringtone.uic.v vVar = this.f158460f;
        if (z17) {
            db5.t7.h(vVar.getActivity(), vVar.getActivity().getResources().getString(com.tencent.mm.R.string.i2p));
        } else {
            db5.t7.g(vVar.getActivity(), vVar.getActivity().getResources().getString(com.tencent.mm.R.string.i2o));
        }
        vVar.getActivity().setResult(6, this.f158461g);
        vVar.getActivity().finish();
        return jz5.f0.f302826a;
    }
}
