package id2;

/* loaded from: classes3.dex */
public final class j4 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public yl2.g1 f290631d;

    /* renamed from: e, reason: collision with root package name */
    public r45.fd2 f290632e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f290633f;

    /* renamed from: g, reason: collision with root package name */
    public final mm2.y6 f290634g;

    /* renamed from: h, reason: collision with root package name */
    public kotlinx.coroutines.q f290635h;

    /* renamed from: i, reason: collision with root package name */
    public int f290636i;

    /* renamed from: m, reason: collision with root package name */
    public long f290637m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f290638n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f290633f = "";
        this.f290634g = new mm2.y6(new gk2.e(null, 1, 0 == true ? 1 : 0));
        this.f290638n = jz5.h.b(new id2.h4(activity));
    }

    public final id2.z3 O6() {
        return (id2.z3) ((jz5.n) this.f290638n).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onActivityResult,requestCode:");
        sb6.append(i17);
        sb6.append(",resultCode:");
        sb6.append(i18);
        sb6.append(",face verify result:");
        sb6.append(intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("FACE_VERIFY_RESULT", 0)) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostPendingUIC", sb6.toString());
        if (i17 == 10002) {
            if (i18 == 1) {
                kotlinx.coroutines.q qVar = this.f290635h;
                if (qVar != null) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    qVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
                }
                id2.v3 v3Var = O6().f290904g;
                if (v3Var != null) {
                    v3Var.e(true);
                    return;
                }
                return;
            }
            kotlinx.coroutines.q qVar2 = this.f290635h;
            if (qVar2 != null) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                qVar2.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
            }
            id2.v3 v3Var2 = O6().f290904g;
            if (v3Var2 != null) {
                v3Var2.e(false);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f290636i = getIntent().getIntExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", 0);
        this.f290637m = getIntent().getLongExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_LUCKY_MONEY_CHAT_ROOM_USERNAME");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f290633f = stringExtra;
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("KEY_TAG_INFO");
        if (byteArrayExtra != null) {
            r45.fd2 fd2Var = new r45.fd2();
            try {
                fd2Var.parseFrom(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                fd2Var = null;
            }
            this.f290632e = fd2Var;
        }
        mm2.y6 y6Var = this.f290634g;
        java.util.ArrayList arrayList = y6Var.f329583g;
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("KEY_WHITE_ROOM_LIST");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>();
        }
        arrayList.addAll(stringArrayListExtra);
        java.util.ArrayList arrayList2 = y6Var.f329584h;
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = getIntent().getStringArrayListExtra("KEY_WHITE_MEMBER_LIST");
        if (stringArrayListExtra2 == null) {
            stringArrayListExtra2 = new java.util.ArrayList<>();
        }
        arrayList2.addAll(stringArrayListExtra2);
        java.util.ArrayList arrayList3 = y6Var.f329585i;
        java.util.ArrayList<java.lang.String> stringArrayListExtra3 = getIntent().getStringArrayListExtra("KEY_WHITE_LABEL_LIST");
        if (stringArrayListExtra3 == null) {
            stringArrayListExtra3 = new java.util.ArrayList<>();
        }
        arrayList3.addAll(stringArrayListExtra3);
        r45.re2 re2Var = new r45.re2();
        java.util.LinkedList list = re2Var.getList(0);
        java.util.ArrayList arrayList4 = y6Var.f329583g;
        list.addAll(arrayList4);
        re2Var.getList(1).addAll(arrayList2);
        re2Var.getList(2).addAll(arrayList4);
        re2Var.getList(2).addAll(arrayList2);
        re2Var.getList(4).addAll(arrayList3);
        y6Var.j(re2Var);
        y6Var.f329581e = getIntent().getIntExtra("KEY_WHITE_LIST_MODE", 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initStartLiveOptions roomId:");
        sb6.append(this.f290633f);
        sb6.append(", visibilityMode:");
        sb6.append(y6Var.f329581e);
        sb6.append("visibilityRoomChooseList:");
        sb6.append(kz5.n0.g0(arrayList4, ";", null, null, 0, null, null, 62, null));
        sb6.append(", visibilityUserChooseList:");
        sb6.append(kz5.n0.g0(arrayList2, ";", null, null, 0, null, null, 62, null));
        sb6.append(",visibilityLabelChooseList:");
        sb6.append(kz5.n0.g0(arrayList3, ";", null, null, 0, null, null, 62, null));
        sb6.append(",tagInfo:");
        r45.fd2 fd2Var2 = this.f290632e;
        sb6.append(fd2Var2 != null ? java.lang.Integer.valueOf(fd2Var2.getInteger(0)) : null);
        sb6.append('#');
        r45.fd2 fd2Var3 = this.f290632e;
        sb6.append(fd2Var3 != null ? fd2Var3.getString(1) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostPendingUIC", sb6.toString());
        pf5.e.launchUI$default(this, null, null, new id2.i4(this, null), 3, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
    }
}
