package i12;

/* loaded from: classes15.dex */
public class c0 extends db5.z8 implements android.view.View.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f287195e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f287196f;

    /* renamed from: g, reason: collision with root package name */
    public int f287197g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f287198h = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f287199i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final i12.a0 f287200m;

    public c0(android.content.Context context, java.util.LinkedList linkedList) {
        i12.a0 a0Var = new i12.a0(null);
        this.f287200m = a0Var;
        if (linkedList == null) {
            throw new java.lang.IllegalAccessError("must has emoji banner list");
        }
        this.f287196f = context;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        this.f287195e = linkedList2;
        linkedList2.addAll(linkedList);
        a0Var.f287165a = this;
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        java.util.LinkedList linkedList = this.f287195e;
        if (linkedList == null) {
            return 0;
        }
        if (linkedList.size() == 1) {
            return 1;
        }
        return linkedList.size() * 60;
    }

    @Override // androidx.viewpager.widget.a
    public int getItemPosition(java.lang.Object obj) {
        int i17 = this.f287197g;
        if (i17 <= 0) {
            return super.getItemPosition(obj);
        }
        this.f287197g = i17 - 1;
        return -2;
    }

    @Override // db5.z8, androidx.viewpager.widget.a
    public void notifyDataSetChanged() {
        if (this.f287198h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "has destroy need to notify");
        } else {
            this.f287197g = getCount();
            super.notifyDataSetChanged();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/adapter/EmojiStoreVpHeaderAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.emoji.model.b bVar = (com.tencent.mm.plugin.emoji.model.b) this.f287195e.get(((java.lang.Integer) view.getTag(com.tencent.mm.R.id.dbf)).intValue());
        if (bVar != null) {
            if (bVar.f97539c) {
                y12.m.a(this.f287196f, bVar.f97537a, true);
            } else {
                r45.zj0 zj0Var = bVar.f97538b.f376210d;
                if (zj0Var != null) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11929, 0);
                    y12.m.e(this.f287196f, zj0Var, false, 15, -1, -1, "", 8, true);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreVpHeaderAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
