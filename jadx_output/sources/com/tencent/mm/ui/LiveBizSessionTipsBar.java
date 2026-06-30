package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class LiveBizSessionTipsBar extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f196866d;

    /* renamed from: e, reason: collision with root package name */
    public yb5.d f196867e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f196868f;

    public LiveBizSessionTipsBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f196868f = null;
        a();
    }

    public final void a() {
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.bqk, this);
        this.f196866d = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.ako);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.akq)).setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.aku));
    }

    public void setChattingContext(yb5.d dVar) {
        this.f196867e = dVar;
        this.f196868f = dVar.x();
        int intExtra = this.f196867e.f460717l.getIntExtra("specific_chat_from_scene", 0);
        java.lang.String e17 = com.tencent.mm.pluginsdk.model.b0.f189197a.e(this.f196868f);
        java.lang.String str = this.f196868f;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23044, 1, this.f196868f, java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(com.tencent.mm.storage.c2.f193803a), e17, java.lang.Integer.valueOf(str == null ? 0 : com.tencent.mm.pluginsdk.model.b0.f189199c.o("live_scene-".concat(str), 0)), 0, "");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(this.f196866d, "chatting_title_bar");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this.f196866d, 40, 26236);
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        arrayMap.put("live_id", "");
        arrayMap.put("finder_username", "");
        arrayMap.put("feed_id", "");
        arrayMap.put("comment_scene", "");
        arrayMap.put("finder_feed_export_id", e17);
        arrayMap.put("wx_username", this.f196868f);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(this.f196866d, arrayMap);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this.f196866d, new com.tencent.mm.ui.j9(this));
        this.f196866d.setOnClickListener(new com.tencent.mm.ui.k9(this, intExtra));
    }

    public LiveBizSessionTipsBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f196868f = null;
        a();
    }
}
