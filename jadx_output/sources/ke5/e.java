package ke5;

/* loaded from: classes9.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f307077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f307078e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f307079f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f307080g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.MMChattingListView f307081h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.msg.MsgIdTalker f307082i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f307083m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ke5.a f307084n;

    public e(ke5.a aVar, int i17, boolean z17, int i18, boolean z18, com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker, android.os.Bundle bundle) {
        this.f307084n = aVar;
        this.f307077d = i17;
        this.f307078e = z17;
        this.f307079f = i18;
        this.f307080g = z18;
        this.f307081h = mMChattingListView;
        this.f307082i = msgIdTalker;
        this.f307083m = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        ke5.a aVar = this.f307084n;
        com.tencent.mm.pluginsdk.ui.tools.v3 C0 = ((com.tencent.mm.ui.chatting.BaseChattingUIFragment) aVar.f307041b.f460718m).C0();
        int i17 = this.f307077d;
        int x17 = C0.x(0, i17);
        aVar.g(i17, this.f307078e, this.f307079f, this.f307080g);
        this.f307081h.o(x17, this.f307082i, this.f307083m);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_POSITION_AT_CHATRECORD_FIRST_IN_BOOLEAN, java.lang.Boolean.FALSE);
    }
}
