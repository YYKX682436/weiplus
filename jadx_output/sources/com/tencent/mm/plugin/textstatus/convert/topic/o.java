package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.q f173330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f173331e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jz5.g f173332f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.textstatus.convert.topic.q qVar, in5.s0 s0Var, jz5.g gVar) {
        super(0);
        this.f173330d = qVar;
        this.f173331e = s0Var;
        this.f173332f = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = (com.tencent.mm.plugin.mvvmlist.MvvmList) this.f173332f.getValue();
        final android.content.Context context = this.f173331e.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        final com.tencent.mm.plugin.textstatus.convert.topic.q qVar = this.f173330d;
        qVar.getClass();
        return new xm3.t0(mvvmList, new in5.s() { // from class: com.tencent.mm.plugin.textstatus.convert.topic.SquareItemConvert$buildItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                com.tencent.mm.plugin.textstatus.convert.topic.u uVar = new com.tencent.mm.plugin.textstatus.convert.topic.u(com.tencent.mm.plugin.textstatus.convert.topic.q.this.f173355v);
                uVar.f173374e = new com.tencent.mm.plugin.textstatus.convert.topic.k(com.tencent.mm.plugin.textstatus.convert.topic.q.this, context);
                return uVar;
            }
        }, false, 4, null);
    }
}
