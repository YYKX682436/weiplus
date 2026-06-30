package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class t3 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f207190d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f207191e;

    public t3(android.content.Context context, java.lang.String str) {
        super(context);
        this.f207190d = context;
        this.f207191e = str;
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488739a90, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.dgy);
        tf5.m.O6(inflate, 14);
        inflate.setOnClickListener(new com.tencent.mm.ui.contact.r3(this));
        findViewById.setOnTouchListener(new com.tencent.mm.ui.contact.s3(this));
        com.tencent.mm.storage.z3 q17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).q(str);
        if (q17 == null || ((int) q17.E2) <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EnterpriseBizViewItem", "contact is null, %s", str);
            return;
        }
        com.tencent.mm.ui.base.MaskLayout maskLayout = (com.tencent.mm.ui.base.MaskLayout) findViewById.findViewById(com.tencent.mm.R.id.ajy);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) maskLayout.getContentView(), str, null);
        if (q17.f1() == 0) {
            maskLayout.setMaskBitmap(null);
        } else if (c01.n8.b() != null) {
            java.lang.String b17 = ((xf4.d) c01.n8.b()).b(q17.f1(), false);
            if (b17 != null) {
                maskLayout.b(r01.y1.a(b17, 1.5f), db5.r8.SUBSCRIPT_DRAWABLE_DIRECTION_BOTTOM_RIGHT);
            } else {
                maskLayout.setMaskBitmap(null);
            }
        } else {
            maskLayout.setMaskBitmap(null);
        }
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.dgz)).setText(q17.f2());
    }
}
