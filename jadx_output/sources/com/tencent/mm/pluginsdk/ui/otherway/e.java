package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.v f190933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f190934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.w f190935f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.pluginsdk.ui.otherway.v vVar, android.content.Context context, com.tencent.mm.pluginsdk.ui.otherway.w wVar) {
        super(0);
        this.f190933d = vVar;
        this.f190934e = context;
        this.f190935f = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f190934e;
        com.tencent.mm.pluginsdk.ui.otherway.w wVar = this.f190935f;
        com.tencent.mm.pluginsdk.ui.otherway.v vVar = this.f190933d;
        vVar.d(context, wVar);
        com.tencent.mm.pluginsdk.model.f2 f2Var = vVar.f191001b.f189318k;
        if (f2Var != null) {
            f2Var.f189299c = null;
        }
        return jz5.f0.f302826a;
    }
}
