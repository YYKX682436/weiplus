package y35;

/* loaded from: classes11.dex */
public class d extends android.widget.LinearLayout implements com.tencent.mm.modelbase.u0 {

    /* renamed from: o, reason: collision with root package name */
    public static y35.j f459195o;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f459196d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f459197e;

    /* renamed from: f, reason: collision with root package name */
    public y35.z f459198f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f459199g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f459200h;

    /* renamed from: i, reason: collision with root package name */
    public y35.k f459201i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f459202m;

    /* renamed from: n, reason: collision with root package name */
    public int f459203n;

    public d(android.content.Context context, int i17) {
        super(context);
        this.f459202m = false;
        this.f459196d = context;
        this.f459203n = i17;
        d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (com.tencent.mm.storage.e9.f(r0).f193881w != 6) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        if (com.tencent.mm.storage.e9.f(r0).f193881w != 6) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
    
        if (r8 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(y35.d r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y35.d.a(y35.d, java.lang.String):void");
    }

    public static void setFMessageArgs(y35.j jVar) {
        f459195o = jVar;
    }

    public void b(y35.r provider) {
        y35.z zVar = this.f459198f;
        zVar.getClass();
        kotlin.jvm.internal.o.g(provider, "provider");
        java.lang.Object tag = getTag();
        jz5.g gVar = zVar.f459267c;
        ((android.view.View) ((jz5.n) gVar).getValue()).setOnClickListener(null);
        if (!provider.k()) {
            android.view.View view = (android.view.View) ((jz5.n) gVar).getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/preference/FMessageSayHiImgHolder", "bindData", "(Lcom/tencent/mm/pluginsdk/ui/preference/FMessageProvider;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/preference/FMessageSayHiImgHolder", "bindData", "(Lcom/tencent/mm/pluginsdk/ui/preference/FMessageProvider;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = (android.view.View) ((jz5.n) gVar).getValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/preference/FMessageSayHiImgHolder", "bindData", "(Lcom/tencent/mm/pluginsdk/ui/preference/FMessageProvider;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/preference/FMessageSayHiImgHolder", "bindData", "(Lcom/tencent/mm/pluginsdk/ui/preference/FMessageProvider;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.ImageView) ((jz5.n) zVar.f459266b).getValue()).setImageResource(com.tencent.mm.R.drawable.f481148cz0);
        android.view.View view3 = (android.view.View) ((jz5.n) zVar.f459268d).getValue();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/pluginsdk/ui/preference/FMessageSayHiImgHolder", "bindData", "(Lcom/tencent/mm/pluginsdk/ui/preference/FMessageProvider;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/pluginsdk/ui/preference/FMessageSayHiImgHolder", "bindData", "(Lcom/tencent/mm/pluginsdk/ui/preference/FMessageProvider;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.content.Context context = (android.content.Context) ((jz5.n) zVar.f459269e).getValue();
        kotlin.jvm.internal.o.f(context, "<get-context>(...)");
        java.lang.String str = provider.f459232a;
        r45.v60 j17 = provider.j();
        y35.u uVar = new y35.u(tag, this, zVar, provider);
        androidx.appcompat.app.AppCompatActivity appCompatActivity = context instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context : null;
        if (appCompatActivity != null) {
            kotlinx.coroutines.l.d(v65.m.b(appCompatActivity), kotlinx.coroutines.q1.f310568a, null, new hr3.vf(str, j17, context, uVar, null), 2, null);
        } else {
            uVar.invoke(null, null);
        }
    }

    public void c() {
        c01.d9.e().q(30, this);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f459200h;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        this.f459200h.dismiss();
    }

    public final void d() {
        android.view.View inflate = android.view.View.inflate(this.f459196d, com.tencent.mm.R.layout.bb6, this);
        this.f459197e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.g_e);
        this.f459198f = new y35.z(inflate);
        e();
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.g_f);
        this.f459199g = button;
        button.setOnClickListener(new y35.g(this));
    }

    public void e() {
        if (f459195o == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FMessageItemView", "initFMessageSayHiImgReport: args is null, skip report registration");
            return;
        }
        android.view.View view = this.f459198f.f459265a;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(view);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view, "greet_img_friend_request");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(view, "add_username", f459195o.f459219a);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(view, new ly1.a() { // from class: y35.d$$a
            @Override // ly1.a
            public final java.util.Map b(java.lang.String str) {
                y35.d dVar = y35.d.this;
                dVar.getClass();
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("greet_friend_request_index", java.lang.Integer.valueOf(dVar.f459203n));
                return hashMap;
            }
        });
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view, 40, 33926);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x015f  */
    @Override // com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r19, int r20, java.lang.String r21, com.tencent.mm.modelbase.m1 r22) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y35.d.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    public void setBtnVisibility(int i17) {
        android.widget.Button button = this.f459199g;
        if (button != null) {
            button.setVisibility(i17);
            y35.k kVar = this.f459201i;
            if (kVar != null) {
                com.tencent.mm.plugin.profile.r0 r0Var = (com.tencent.mm.plugin.profile.r0) kVar;
                if (this.f459199g.getVisibility() == 0) {
                    ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.profile.g0(r0Var, r0Var.f153597b.f153421e.d1()));
                }
            }
        }
    }

    public void setContentText(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f459197e.setVisibility(8);
            return;
        }
        this.f459197e.setVisibility(0);
        android.widget.TextView textView = this.f459197e;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        if (str == null) {
            str = "";
        }
        float textSize = this.f459197e.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this.f459196d, str, textSize));
    }

    public void setGotoSayHiCallBack(y35.k kVar) {
        this.f459201i = kVar;
    }

    public void setItemPosition(int i17) {
        this.f459203n = i17;
    }

    public d(android.content.Context context, boolean z17) {
        super(context);
        this.f459202m = false;
        this.f459203n = 0;
        this.f459196d = context;
        this.f459202m = z17;
        d();
    }
}
