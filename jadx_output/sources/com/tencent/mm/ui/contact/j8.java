package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public class j8 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f206968d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f206969e;

    public j8(android.content.Context context, java.lang.String str) {
        super(context);
        this.f206968d = context;
        this.f206969e = str;
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.c8s, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.dgy);
        tf5.m.O6(inflate, 7);
        inflate.setOnClickListener(new com.tencent.mm.ui.contact.h8(this));
        findViewById.setOnTouchListener(new com.tencent.mm.ui.contact.i8(this));
        com.tencent.mm.ui.base.MaskLayout maskLayout = (com.tencent.mm.ui.base.MaskLayout) findViewById.findViewById(com.tencent.mm.R.id.ajy);
        ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Ri(str, "openim_acct_type_icon", j41.a0.TYPE_URL);
        if (str.equals("cloudim")) {
            ((android.widget.ImageView) maskLayout.getContentView()).setImageResource(com.tencent.mm.R.raw.avatar_wechat_frame);
        }
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.dgz)).setText(((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Ri(str, "openim_acct_type_title", j41.a0.TYPE_WORDING));
    }
}
