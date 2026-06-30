package i05;

/* loaded from: classes4.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f286584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p94.u0 f286585e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.emotion.EmojiInfo f286586f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i05.j f286587g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i17, p94.u0 u0Var, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, i05.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f286584d = i17;
        this.f286585e = u0Var;
        this.f286586f = emojiInfo;
        this.f286587g = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new i05.k(this.f286584d, this.f286585e, this.f286586f, this.f286587g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        i05.k kVar = (i05.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        kVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int i17 = this.f286584d;
        p94.u0 u0Var = this.f286585e;
        if (i17 == 0) {
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = this.f286586f;
            kotlin.jvm.internal.o.f(emojiInfo, "$emojiInfo");
            u0Var.b(emojiInfo);
            i05.j.b(this.f286587g, 0L, null, null, 6, null);
        } else {
            u0Var.a();
            i05.j.b(this.f286587g, 3L, null, null, 6, null);
        }
        return jz5.f0.f302826a;
    }
}
