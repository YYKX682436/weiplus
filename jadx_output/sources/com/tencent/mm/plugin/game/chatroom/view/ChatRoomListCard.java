package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes8.dex */
public class ChatRoomListCard extends com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView {

    /* renamed from: j2, reason: collision with root package name */
    public static int f138895j2;

    /* renamed from: f2, reason: collision with root package name */
    public android.content.Context f138896f2;

    /* renamed from: g2, reason: collision with root package name */
    public long f138897g2;

    /* renamed from: h2, reason: collision with root package name */
    public long f138898h2;

    /* renamed from: i2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.chatroom.view.z f138899i2;

    public ChatRoomListCard(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        l1(context);
    }

    public final void l1(android.content.Context context) {
        this.f138896f2 = context;
        this.f138897g2 = ((android.app.Activity) context).getIntent().getLongExtra("game_report_sourceid", 0L);
        long longExtra = ((android.app.Activity) this.f138896f2).getIntent().getLongExtra("game_report_ssid", 0L);
        this.f138898h2 = longExtra;
        com.tencent.mm.game.report.g.f68195a.p(0L, 1L, 0L, longExtra, this.f138897g2);
        f138895j2 = i65.a.b(context, 400);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(context);
        linearLayoutManager.Q(1);
        setLayoutManager(linearLayoutManager);
        setItemAnimator(null);
        com.tencent.mm.plugin.game.chatroom.view.z zVar = new com.tencent.mm.plugin.game.chatroom.view.z(this);
        this.f138899i2 = zVar;
        setAdapter(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRoomListCard", "onAttachedToWindow");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRoomListCard", "onDetachedFromWindow");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i17, int i18) {
        int size = android.view.View.MeasureSpec.getSize(i18);
        int i19 = f138895j2;
        if (i19 <= size && i19 > 0) {
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Float.valueOf(i19).intValue(), Integer.MIN_VALUE);
        }
        super.onMeasure(i17, i18);
    }

    public void setData(java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo> list) {
        com.tencent.mm.plugin.game.chatroom.view.z zVar = this.f138899i2;
        if (zVar != null) {
            if (list == null) {
                zVar.getClass();
                return;
            }
            java.util.LinkedList linkedList = (java.util.LinkedList) zVar.f139362d;
            linkedList.clear();
            linkedList.addAll(list);
            zVar.notifyDataSetChanged();
        }
    }

    public ChatRoomListCard(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        l1(context);
    }
}
