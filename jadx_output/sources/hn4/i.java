package hn4;

/* loaded from: classes15.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f282573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f282574e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hn4.j f282575f;

    public i(hn4.j jVar, java.util.List list, boolean z17) {
        this.f282575f = jVar;
        this.f282573d = list;
        this.f282574e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        fn4.z0 z0Var = ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) ((hn4.b) this.f282575f.f264492g)).K;
        synchronized (z0Var) {
            java.util.LinkedList linkedList = (java.util.LinkedList) z0Var.b();
            boolean z17 = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryListVideoAdapter", "callbackToSuccess originSize: %d insertSize %d", java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(this.f282573d.size()));
            if (this.f282574e) {
                int size = linkedList.size();
                if (linkedList.size() > 0) {
                    if (((r45.xn6) linkedList.get(0)).f390259h.equals(((r45.xn6) this.f282573d.get(0)).f390259h)) {
                        linkedList.clear();
                    } else {
                        this.f282573d.remove(0);
                        z17 = false;
                    }
                    linkedList.addAll(this.f282573d);
                    if (z17) {
                        r45.xn6 xn6Var = (r45.xn6) this.f282573d.get(0);
                        linkedList.set(0, xn6Var);
                        fn4.m E = this.f282575f.E(xn6Var);
                        if (E != null) {
                            E.q(xn6Var);
                        }
                    }
                    hn4.j jVar = this.f282575f;
                    if (jVar.f282579m) {
                        jVar.notifyDataSetChanged();
                    } else {
                        if (jVar.f282580n != null && linkedList.get(0) != null) {
                            r45.xn6 xn6Var2 = (r45.xn6) linkedList.get(0);
                            this.f282575f.f282580n.q(xn6Var2);
                            ((java.util.HashMap) this.f282575f.f264491f).put(xn6Var2.f390259h, new java.lang.ref.WeakReference(this.f282575f.f282580n));
                            this.f282575f.f282580n = null;
                            if ((xn6Var2.L & 128) > 0 && gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_VIDEO_EDUCATION_INT, 0) <= 0) {
                                this.f282575f.f264492g.getRecyclerView().postDelayed(new hn4.h(this), 1000L);
                            }
                        }
                        hn4.j jVar2 = this.f282575f;
                        jVar2.notifyItemRangeInserted(jVar2.z() + size, this.f282573d.size() - size);
                    }
                    ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) ((hn4.b) this.f282575f.f264492g)).H.e((r45.xn6) linkedList.get(0));
                } else {
                    linkedList.addAll(this.f282573d);
                    hn4.j jVar3 = this.f282575f;
                    jVar3.notifyItemRangeInserted(jVar3.z(), this.f282573d.size());
                }
            } else {
                int size2 = linkedList.size();
                linkedList.addAll(this.f282573d);
                hn4.j jVar4 = this.f282575f;
                jVar4.notifyItemRangeInserted(size2 + jVar4.z(), this.f282573d.size());
            }
        }
    }
}
