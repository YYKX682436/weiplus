package hf2;

/* loaded from: classes3.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f281029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hf2.e1 f281030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ei0 f281031f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281032g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f281033h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(hf2.e1 e1Var, r45.ei0 ei0Var, java.lang.String str, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281030e = e1Var;
        this.f281031f = ei0Var;
        this.f281032g = str;
        this.f281033h = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hf2.c1(this.f281030e, this.f281031f, this.f281032g, this.f281033h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hf2.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object a17;
        r45.ji0 ji0Var;
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f281029d;
        r45.ei0 ei0Var = this.f281031f;
        hf2.e1 e1Var = this.f281030e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f281029d = 1;
            a17 = hf2.e1.a(e1Var, ei0Var, this);
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            a17 = obj;
        }
        if (!((java.lang.Boolean) a17).booleanValue()) {
            pm0.v.X(new hf2.b1(this.f281033h, e1Var));
        } else if (ei0Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(this.f281032g);
            java.util.LinkedList linkedList = ei0Var.f373529d;
            if (linkedList != null && (ji0Var = (r45.ji0) kz5.n0.Z(linkedList)) != null && (str = ji0Var.f377829n) != null) {
                sb6.append(str);
            }
            if ((e1Var.f281053c.length() > 0) != false) {
                sb6.append(";");
                sb6.append(e1Var.f281053c);
            }
            com.tencent.mm.plugin.finder.assist.u8 u8Var = com.tencent.mm.plugin.finder.assist.u8.f102599a;
            gk2.e buContext = e1Var.f281051a.getStore().getLiveRoomData();
            java.lang.String sb7 = sb6.toString();
            kotlin.jvm.internal.o.f(sb7, "toString(...)");
            kotlin.jvm.internal.o.g(buContext, "buContext");
            long integer = ((mm2.e1) buContext.a(mm2.e1.class)).f328988r.getInteger(4);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(((mm2.e1) buContext.a(mm2.e1.class)).f328988r.getInteger(6));
            if (!(valueOf.intValue() > 0)) {
                valueOf = null;
            }
            u8Var.a(((mm2.e1) buContext.a(mm2.e1.class)).f328988r.getLong(0), integer, (valueOf != null ? valueOf.intValue() : c01.id.e()) - integer, ((mm2.e1) buContext.a(mm2.e1.class)).f328994x, ((mm2.f6) buContext.a(mm2.f6.class)).N6() ? 1 : 0, ((mm2.c1) buContext.a(mm2.c1.class)).f328813h2, ((mm2.c1) buContext.a(mm2.c1.class)).f328807g2, "", 0, 0, "anchorSticker", sb7);
        }
        return jz5.f0.f302826a;
    }
}
