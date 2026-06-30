package za3;

/* loaded from: classes15.dex */
public class a0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f470888d;

    public a0(za3.e0 e0Var, java.util.ArrayList arrayList) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f470888d = arrayList2;
        arrayList2.addAll(arrayList);
    }

    public za3.c0 a(java.lang.String str) {
        int i17 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f470888d;
            if (i17 >= arrayList.size()) {
                return null;
            }
            if (((za3.c0) arrayList.get(i17)).f470895a.equals(str)) {
                return (za3.c0) arrayList.get(i17);
            }
            i17++;
        }
    }

    public boolean c(java.lang.String str) {
        int i17 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f470888d;
            if (i17 >= arrayList.size()) {
                return false;
            }
            if (((za3.c0) arrayList.get(i17)).f470895a.equals(str)) {
                return true;
            }
            i17++;
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f470888d.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f470888d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        return ((za3.c0) this.f470888d.get(i17)).f470898d.f470890a;
    }
}
