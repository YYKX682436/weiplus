package cy3;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f224831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vx3.i f224832e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f224833f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f224834g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f224835h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.y1 f224836i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224837m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f224838n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f224839o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.content.Context context, vx3.i iVar, yz5.p pVar, long j17, int i17, com.tencent.mm.plugin.ringtone.uic.y1 y1Var, java.lang.String str, boolean z17, int i18) {
        super(3);
        this.f224831d = context;
        this.f224832e = iVar;
        this.f224833f = pVar;
        this.f224834g = j17;
        this.f224835h = i17;
        this.f224836i = y1Var;
        this.f224837m = str;
        this.f224838n = z17;
        this.f224839o = i18;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String toFriend = (java.lang.String) obj2;
        com.tencent.mm.ui.widget.dialog.z2 dialog = (com.tencent.mm.ui.widget.dialog.z2) obj3;
        kotlin.jvm.internal.o.g(toFriend, "toFriend");
        kotlin.jvm.internal.o.g(dialog, "dialog");
        return kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new cy3.o(toFriend, this.f224831d, this.f224832e, booleanValue, dialog, this.f224833f, this.f224834g, this.f224835h, this.f224836i, this.f224837m, this.f224838n, this.f224839o, null), 3, null);
    }
}
