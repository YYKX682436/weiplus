package gn4;

/* loaded from: classes15.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f273590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f273591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gn4.c1 f273592f;

    public b1(gn4.c1 c1Var, java.util.List list, boolean z17) {
        this.f273592f = c1Var;
        this.f273590d = list;
        this.f273591e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        fn4.z0 s47 = this.f273592f.f273601h.s4();
        synchronized (s47) {
            java.util.LinkedList linkedList = (java.util.LinkedList) s47.b();
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryOnlyFSVideoAdapter", "callbackToSuccess originSize: %d insertSize %d", java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(this.f273590d.size()));
            if (this.f273591e) {
                int size = linkedList.size();
                if (linkedList.size() > 0) {
                    linkedList.clear();
                    linkedList.addAll(this.f273590d);
                    gn4.c1 c1Var = this.f273592f;
                    if (c1Var.f273603m) {
                        c1Var.notifyDataSetChanged();
                    } else {
                        if (c1Var.f273604n != null && linkedList.get(0) != null) {
                            r45.xn6 xn6Var = (r45.xn6) linkedList.get(0);
                            this.f273592f.f273604n.q(xn6Var);
                            ((java.util.HashMap) this.f273592f.f264491f).put(xn6Var.f390259h, new java.lang.ref.WeakReference(this.f273592f.f273604n));
                            this.f273592f.f273604n = null;
                            if ((xn6Var.L & 128) > 0 && gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_VIDEO_EDUCATION_INT, 0) <= 0) {
                                this.f273592f.f264492g.getRecyclerView().postDelayed(new gn4.a1(this), 1000L);
                            }
                        }
                        gn4.c1 c1Var2 = this.f273592f;
                        c1Var2.notifyItemRangeInserted(c1Var2.z() + size, this.f273590d.size() - size);
                    }
                    this.f273592f.f273601h.o4().e((r45.xn6) this.f273590d.get(0));
                } else {
                    linkedList.addAll(this.f273590d);
                    gn4.c1 c1Var3 = this.f273592f;
                    c1Var3.notifyItemRangeInserted(c1Var3.z(), this.f273590d.size());
                }
            } else {
                int size2 = linkedList.size();
                linkedList.addAll(this.f273590d);
                gn4.c1 c1Var4 = this.f273592f;
                c1Var4.notifyItemChanged(c1Var4.z() + size2);
                gn4.c1 c1Var5 = this.f273592f;
                c1Var5.notifyItemRangeInserted(size2 + c1Var5.z(), this.f273590d.size());
            }
        }
    }
}
