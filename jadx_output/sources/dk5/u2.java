package dk5;

/* loaded from: classes9.dex */
public class u2 implements dk5.l7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f234928a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r35.i1 f234929b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f234930c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f234931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234932e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234933f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234934g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234935h;

    public u2(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI, android.content.Intent intent, r35.i1 i1Var, java.util.HashMap hashMap, boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f234935h = selectConversationUI;
        this.f234928a = intent;
        this.f234929b = i1Var;
        this.f234930c = hashMap;
        this.f234931d = z17;
        this.f234932e = str;
        this.f234933f = str2;
        this.f234934g = str3;
    }

    @Override // dk5.l7
    public void a() {
        this.f234928a.putExtra("KShowTodoIntroduceView", 1);
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234935h;
        android.content.Intent intent = this.f234928a;
        r35.i1 i1Var = this.f234929b;
        java.util.HashMap hashMap = this.f234930c;
        boolean z17 = this.f234931d;
        java.lang.String str = this.f234932e;
        java.lang.String str2 = this.f234933f;
        java.lang.String str3 = this.f234934g;
        int i17 = com.tencent.mm.ui.transmit.SelectConversationUI.B2;
        selectConversationUI.B7(intent, i1Var, hashMap, z17, str, str2, str3);
    }
}
