package com.tencent.mm.ui.anim;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/anim/RepairerSharedElementDemo2;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class RepairerSharedElementDemo2 extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {

    /* renamed from: m, reason: collision with root package name */
    public static java.util.List f197153m;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f197154d = kz5.c0.i(java.lang.Integer.valueOf(com.tencent.mm.R.raw.text_state_default_image_1_filled_colorful), java.lang.Integer.valueOf(com.tencent.mm.R.raw.text_state_default_image_2_filled_colorful), java.lang.Integer.valueOf(com.tencent.mm.R.raw.text_state_default_image_3_filled_colorful), java.lang.Integer.valueOf(com.tencent.mm.R.raw.text_state_default_image_4_filled_colorful), java.lang.Integer.valueOf(com.tencent.mm.R.raw.text_state_default_image_5_filled_colorful), java.lang.Integer.valueOf(com.tencent.mm.R.raw.text_state_default_image_6_filled_colorful), java.lang.Integer.valueOf(com.tencent.mm.R.raw.text_state_default_image_7_filled_colorful), java.lang.Integer.valueOf(com.tencent.mm.R.raw.text_state_default_image_8_filled_colorful), java.lang.Integer.valueOf(com.tencent.mm.R.raw.text_state_default_image_9_filled_colorful), java.lang.Integer.valueOf(com.tencent.mm.R.raw.text_state_default_image_10_filled_colorful), java.lang.Integer.valueOf(com.tencent.mm.R.raw.text_state_default_image_11_filled_colorful), java.lang.Integer.valueOf(com.tencent.mm.R.raw.text_state_default_image_12_filled_colorful));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f197155e = jz5.h.b(new na5.t(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f197156f = jz5.h.b(new na5.s(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f197157g = jz5.h.b(new na5.m(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f197158h = jz5.h.b(new na5.l(this));

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f197159i = new java.util.LinkedList();

    public final java.util.List U6(int i17) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i18 = 0; i18 < i17; i18++) {
            c06.d dVar = c06.e.f37716d;
            java.util.List list = this.f197154d;
            linkedList.add(list.get(dVar.d(list.size())));
        }
        return linkedList;
    }

    public final androidx.recyclerview.widget.RecyclerView V6() {
        java.lang.Object value = ((jz5.n) this.f197155e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (androidx.recyclerview.widget.RecyclerView) value;
    }

    public void W6(java.util.List dataList) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        int i17 = dataList.size() > 1 ? dataList.size() <= 4 ? 2 : 3 : 1;
        java.util.LinkedList linkedList = this.f197159i;
        linkedList.clear();
        V6().setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(this, i17));
        V6().setAdapter(new na5.f(dataList, 9, linkedList));
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479642bh);
        if (V6().getItemDecorationCount() > 0) {
            V6().T0(0);
        }
        V6().N(new na5.r(dimensionPixelSize));
    }

    public void X6(int i17) {
        java.util.List U6 = U6(i17);
        W6(U6);
        ((android.widget.EditText) ((jz5.n) this.f197157g).getValue()).setText(java.lang.String.valueOf(i17));
        f197153m = U6;
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity
    public void finishAfterTransition() {
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bpe;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        jz5.g gVar = this.f197156f;
        java.lang.Object value = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((androidx.recyclerview.widget.RecyclerView) value).setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(this, 8));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 1; i17 < 30; i17++) {
            linkedList.add(java.lang.Integer.valueOf(i17));
        }
        java.lang.Object value2 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((androidx.recyclerview.widget.RecyclerView) value2).setAdapter(new na5.g(linkedList, new na5.q(this)));
        ((android.widget.Button) ((jz5.n) this.f197158h).getValue()).setOnClickListener(new na5.n(this));
        X6(9);
        V6().setOnTouchListener(na5.o.f336015d);
        V6().setOnClickListener(new na5.p(this));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }
}
