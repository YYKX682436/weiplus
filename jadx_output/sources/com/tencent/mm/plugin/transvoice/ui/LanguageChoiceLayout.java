package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes8.dex */
public class LanguageChoiceLayout extends android.widget.RelativeLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f175403m = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f175404d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f175405e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f175406f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f175407g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f175408h;

    /* renamed from: i, reason: collision with root package name */
    public rn4.d f175409i;

    public LanguageChoiceLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f175404d = null;
        this.f175405e = null;
        this.f175406f = null;
        this.f175407g = null;
        this.f175408h = null;
        this.f175409i = null;
        b();
    }

    public void a() {
        this.f175407g.animate().translationY(com.tencent.mm.ui.bl.b(getContext()).y).setDuration(200L).setListener(new com.tencent.mm.plugin.transvoice.ui.i(this)).start();
    }

    public final void b() {
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.c7w, this);
        this.f175407g = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.k_u);
        this.f175404d = (android.widget.Button) findViewById(com.tencent.mm.R.id.k_t);
        this.f175405e = (android.widget.Button) findViewById(com.tencent.mm.R.id.k_x);
        this.f175406f = findViewById(com.tencent.mm.R.id.k_s);
        this.f175408h = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.k_w);
        this.f175409i = new rn4.d();
        this.f175408h.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        this.f175408h.setAdapter(this.f175409i);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("VoiceInputLanguageSupportType", 1);
        if (com.tencent.mm.sdk.platformtools.m2.j()) {
            arrayList.add(new rn4.b(getContext().getString(com.tencent.mm.R.string.g_2), 1));
            if ((b17 & 2) != 0) {
                arrayList.add(new rn4.b(getContext().getString(com.tencent.mm.R.string.g_0), 2));
            }
            if ((b17 & 4) != 0) {
                arrayList.add(new rn4.b(getContext().getString(com.tencent.mm.R.string.g_1), 4));
            }
            if ((b17 & 8) != 0) {
                arrayList.add(new rn4.b(getContext().getString(com.tencent.mm.R.string.g_3), 8));
            }
        } else if (com.tencent.mm.sdk.platformtools.m2.d().equals("en")) {
            arrayList.add(new rn4.b(getContext().getString(com.tencent.mm.R.string.g_1), 4));
            arrayList.add(new rn4.b(getContext().getString(com.tencent.mm.R.string.g_2), 1));
            if ((b17 & 2) != 0) {
                arrayList.add(new rn4.b(getContext().getString(com.tencent.mm.R.string.g_0), 2));
            }
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f175409i.f397968d;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        this.f175409i.notifyDataSetChanged();
        this.f175407g.setTranslationY(com.tencent.mm.ui.bl.b(getContext()).y);
        this.f175406f.setOnClickListener(new com.tencent.mm.plugin.transvoice.ui.f(this));
        this.f175404d.setOnClickListener(new com.tencent.mm.plugin.transvoice.ui.g(this));
        this.f175405e.setOnClickListener(new com.tencent.mm.plugin.transvoice.ui.h(this));
    }

    public void setSelectLanguageListener(com.tencent.mm.plugin.transvoice.ui.j jVar) {
    }

    public void setSelectedLang(int i17) {
        rn4.d dVar = this.f175409i;
        if (dVar != null) {
            dVar.f397969e = i17;
            dVar.notifyDataSetChanged();
        }
    }

    public LanguageChoiceLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f175404d = null;
        this.f175405e = null;
        this.f175406f = null;
        this.f175407g = null;
        this.f175408h = null;
        this.f175409i = null;
        b();
    }
}
