package qs2;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f366296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f366297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zy2.b6 f366298f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f366299g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f366300h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f366301i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ qs2.q f366302m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f366303n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f366304o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(byte[] bArr, zy2.b6 b6Var, android.content.Intent intent, boolean z17, android.content.Context context, qs2.q qVar, long j17, long j18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f366297e = bArr;
        this.f366298f = b6Var;
        this.f366299g = intent;
        this.f366300h = z17;
        this.f366301i = context;
        this.f366302m = qVar;
        this.f366303n = j17;
        this.f366304o = j18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qs2.i(this.f366297e, this.f366298f, this.f366299g, this.f366300h, this.f366301i, this.f366302m, this.f366303n, this.f366304o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qs2.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List list;
        java.lang.Object e17;
        java.util.LinkedList linkedList;
        com.tencent.mm.protobuf.g gVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f366296d;
        zy2.b6 b6Var = this.f366298f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.protobuf.f parseFrom = new r45.h70().parseFrom(this.f366297e);
            r45.h70 h70Var = parseFrom instanceof r45.h70 ? (r45.h70) parseFrom : null;
            if (h70Var == null || (linkedList = h70Var.f375897d) == null) {
                list = kz5.p0.f313996d;
            } else {
                list = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    list.add(((r45.ho6) it.next()).f376333d);
                }
            }
            ((c61.l7) b6Var).getClass();
            i95.m c17 = i95.n0.c(ci0.q.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            vt3.l lVar = vt3.l.f440005a;
            lVar.b(list, 8, true);
            this.f366296d = 1;
            ((c61.l7) b6Var).getClass();
            i95.m c18 = i95.n0.c(ci0.q.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            e17 = lVar.e(this);
            if (e17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            e17 = obj;
        }
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) e17;
        if (byteBuffer != null) {
            byte[] bArr = new byte[byteBuffer.capacity()];
            byteBuffer.rewind();
            byteBuffer.get(bArr);
            gVar = com.tencent.mm.protobuf.g.b(bArr);
        } else {
            gVar = null;
        }
        ((c61.l7) b6Var).getClass();
        i95.m c19 = i95.n0.c(ci0.q.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        vt3.l.f440005a.d();
        this.f366299g.putExtra("KEY_POST_ASSET_INFO", gVar != null ? gVar.g() : null);
        pm0.v.X(new qs2.h(this.f366300h, this.f366301i, this.f366299g, this.f366302m, this.f366303n, this.f366304o));
        return jz5.f0.f302826a;
    }
}
