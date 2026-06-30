package tl5;

/* loaded from: classes10.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl5.d f420374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f420375e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tl5.s f420376f;

    public m(tl5.d dVar, androidx.recyclerview.widget.RecyclerView recyclerView, tl5.s sVar) {
        this.f420374d = dVar;
        this.f420375e = recyclerView;
        this.f420376f = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tl5.d dVar = this.f420374d;
        java.util.Iterator it = dVar.f420339d.iterator();
        while (it.hasNext()) {
            android.graphics.drawable.Drawable drawable = ((tl5.i) it.next()).f420356f;
            if (drawable != null && drawable.getAlpha() != 255) {
                drawable.setAlpha(255);
            }
        }
        dVar.f420339d = kz5.p0.f313996d;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f420375e;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        dVar.f420342g = 0;
        dVar.f420341f = false;
        recyclerView.getOverlay().remove(dVar);
        tl5.s sVar = this.f420376f;
        sVar.f420388d = null;
        sVar.f420387c = tl5.l.f420369d;
        sVar.f420392h = 0;
        sVar.f420393i = 0;
        sVar.f420391g = null;
        sVar.f420394j = null;
        sVar.f420395k = false;
        sVar.f420396l = 0.0f;
        sVar.f420397m = null;
        java.lang.ref.WeakReference weakReference = sVar.f420390f;
        if (weakReference != null) {
            weakReference.clear();
        }
        sVar.f420390f = null;
    }
}
