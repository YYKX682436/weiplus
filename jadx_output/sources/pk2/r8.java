package pk2;

/* loaded from: classes3.dex */
public final class r8 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.d9 f356218d;

    public r8(pk2.d9 d9Var) {
        this.f356218d = d9Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        g4Var.clear();
        pk2.d9 d9Var = this.f356218d;
        java.util.Iterator it = d9Var.f355671n.iterator();
        while (it.hasNext()) {
            ((qk2.h) it.next()).w(g4Var);
        }
        if (g4Var.z()) {
            pk2.c7 c7Var = d9Var.f355662e;
            android.widget.TextView textView = c7Var != null ? c7Var.f355629l : null;
            if (textView != null) {
                textView.setVisibility(8);
            }
            pk2.c7 c7Var2 = d9Var.f355662e;
            recyclerView = c7Var2 != null ? c7Var2.f355625h : null;
            if (recyclerView == null) {
                return;
            }
            recyclerView.setVisibility(8);
            return;
        }
        pk2.c7 c7Var3 = d9Var.f355662e;
        android.widget.TextView textView2 = c7Var3 != null ? c7Var3.f355629l : null;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        pk2.c7 c7Var4 = d9Var.f355662e;
        recyclerView = c7Var4 != null ? c7Var4.f355625h : null;
        if (recyclerView == null) {
            return;
        }
        recyclerView.setVisibility(0);
    }
}
