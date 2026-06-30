package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public abstract class d extends android.widget.BaseAdapter {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f141351i = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f141352d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f141353e;

    /* renamed from: f, reason: collision with root package name */
    public kk.j f141354f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f141355g = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.game.ui.b(this), false);

    /* renamed from: h, reason: collision with root package name */
    public final l75.q0 f141356h;

    public d(android.content.Context context) {
        com.tencent.mm.plugin.game.ui.c cVar = new com.tencent.mm.plugin.game.ui.c(this);
        this.f141356h = cVar;
        this.f141352d = context;
        this.f141353e = new java.util.LinkedList();
        this.f141354f = new jt0.i(20, getClass());
        ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
        zo3.p.Ri().add(cVar);
    }

    public void a(java.util.LinkedList linkedList) {
        if (linkedList == null) {
            return;
        }
        this.f141353e.addAll(linkedList);
        super.notifyDataSetChanged();
    }

    public void c(java.util.LinkedList linkedList) {
        if (linkedList == null) {
            return;
        }
        this.f141353e = linkedList;
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f141353e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f141353e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }
}
