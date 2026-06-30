package u4;

/* loaded from: classes13.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f424499a;

    /* renamed from: b, reason: collision with root package name */
    public final int f424500b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup f424501c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f424502d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Runnable f424503e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Runnable f424504f;

    public j0(android.view.ViewGroup viewGroup, int i17, android.content.Context context) {
        this.f424500b = -1;
        this.f424499a = context;
        this.f424501c = viewGroup;
        this.f424500b = i17;
    }

    public static u4.j0 b(android.view.ViewGroup viewGroup, int i17, android.content.Context context) {
        android.util.SparseArray sparseArray = (android.util.SparseArray) viewGroup.getTag(com.tencent.mm.R.id.oj8);
        if (sparseArray == null) {
            sparseArray = new android.util.SparseArray();
            viewGroup.setTag(com.tencent.mm.R.id.oj8, sparseArray);
        }
        u4.j0 j0Var = (u4.j0) sparseArray.get(i17);
        if (j0Var != null) {
            return j0Var;
        }
        u4.j0 j0Var2 = new u4.j0(viewGroup, i17, context);
        sparseArray.put(i17, j0Var2);
        return j0Var2;
    }

    public void a() {
        android.view.View view = this.f424502d;
        android.view.ViewGroup viewGroup = this.f424501c;
        int i17 = this.f424500b;
        if (i17 > 0 || view != null) {
            viewGroup.removeAllViews();
            if (i17 > 0) {
                android.view.LayoutInflater.from(this.f424499a).inflate(i17, viewGroup);
            } else {
                viewGroup.addView(view);
            }
        }
        java.lang.Runnable runnable = this.f424503e;
        if (runnable != null) {
            runnable.run();
        }
        viewGroup.setTag(com.tencent.mm.R.id.f487395oj2, this);
    }

    public j0(android.view.ViewGroup viewGroup, android.view.View view) {
        this.f424500b = -1;
        this.f424501c = viewGroup;
        this.f424502d = view;
    }
}
