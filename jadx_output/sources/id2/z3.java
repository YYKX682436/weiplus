package id2;

/* loaded from: classes3.dex */
public final class z3 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public int f290901d;

    /* renamed from: e, reason: collision with root package name */
    public int f290902e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f290903f;

    /* renamed from: g, reason: collision with root package name */
    public id2.v3 f290904g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.t f290905h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f290906i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f290907m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f290902e = 3;
        this.f290903f = true;
        this.f290905h = new id2.x3(this);
        this.f290906i = jz5.h.b(new id2.y3(activity));
        this.f290907m = jz5.h.b(new id2.w3(activity));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        int intExtra = getIntent().getIntExtra("ENTER_SCENE", 0);
        this.f290901d = intExtra;
        if (intExtra == 1) {
            id2.s5 s5Var = (id2.s5) ((jz5.n) this.f290906i).getValue();
            ((id2.z3) ((jz5.n) s5Var.f290798d).getValue()).f290902e = 9;
            ((id2.z3) ((jz5.n) s5Var.f290798d).getValue()).f290904g = new id2.q5();
            return;
        }
        if (intExtra != 2) {
            return;
        }
        id2.l lVar = (id2.l) ((jz5.n) this.f290907m).getValue();
        java.lang.String stringExtra = lVar.getIntent().getStringExtra("KEY_FROM_CHAT_ROOM_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        lVar.f290650d = stringExtra;
        lVar.f290652f = lVar.getIntent().getBooleanExtra("KEY_WHITE_LIST_MODE_UNSELECT", false);
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "init fromChatRoomId:" + lVar.f290650d);
        lVar.P6().f290902e = 3;
        lVar.P6().f290903f = false;
        id2.z3 P6 = lVar.P6();
        id2.i iVar = new id2.i(lVar);
        P6.getClass();
        P6.f290905h = iVar;
        lVar.P6().f290904g = new id2.j();
    }
}
