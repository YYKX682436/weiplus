package db1;

/* loaded from: classes5.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db1.p f227848d;

    public n(db1.p pVar) {
        this.f227848d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        db1.p pVar = this.f227848d;
        android.content.Context context = pVar.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pVar.f227867x = new vi1.l0("", context, pVar.f227869z);
        pVar.f227860q.setAdapter(pVar.f227867x);
        if (pVar.f227869z.size() == 0) {
            pVar.f227858o.setVisibility(8);
            return;
        }
        if (pVar.f227869z.size() == 1) {
            pVar.f227858o.setVisibility(0);
            androidx.recyclerview.widget.f2 adapter = pVar.f227860q.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            pVar.f227861r.setText(pVar.getContext().getString(com.tencent.mm.R.string.a3s));
            return;
        }
        pVar.f227858o.setVisibility(0);
        androidx.recyclerview.widget.f2 adapter2 = pVar.f227860q.getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
        pVar.f227861r.setText(pVar.getContext().getString(com.tencent.mm.R.string.a3r));
    }
}
