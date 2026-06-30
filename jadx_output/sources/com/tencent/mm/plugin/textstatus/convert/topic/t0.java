package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.y0 f173371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f173372e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jz5.g f173373f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.tencent.mm.plugin.textstatus.convert.topic.y0 y0Var, in5.s0 s0Var, jz5.g gVar) {
        super(0);
        this.f173371d = y0Var;
        this.f173372e = s0Var;
        this.f173373f = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = (com.tencent.mm.plugin.mvvmlist.MvvmList) this.f173373f.getValue();
        final android.content.Context context = this.f173372e.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        final com.tencent.mm.plugin.textstatus.convert.topic.y0 y0Var = this.f173371d;
        y0Var.getClass();
        return new xm3.t0(mvvmList, new in5.s() { // from class: com.tencent.mm.plugin.textstatus.convert.topic.TopicSquareItemConvert$buildItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                com.tencent.mm.plugin.textstatus.convert.topic.i iVar = new com.tencent.mm.plugin.textstatus.convert.topic.i();
                iVar.f173286e = new com.tencent.mm.plugin.textstatus.convert.topic.o0(com.tencent.mm.plugin.textstatus.convert.topic.y0.this, context);
                return iVar;
            }
        }, false, 4, null);
    }
}
