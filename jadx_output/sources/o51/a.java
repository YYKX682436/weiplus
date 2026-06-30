package o51;

/* loaded from: classes11.dex */
public class a implements p51.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f343083a;

    public a(java.util.List list) {
        this.f343083a = list;
    }

    @Override // p51.b
    public java.lang.String a(int i17) {
        java.lang.Object item = getItem(i17);
        if (item == null) {
            item = "";
        } else if (!(item instanceof java.lang.String)) {
            item = item.toString();
        }
        return (java.lang.String) item;
    }

    @Override // p51.b
    public java.lang.Object getItem(int i17) {
        if (i17 < 0) {
            return "";
        }
        java.util.List list = this.f343083a;
        return i17 < list.size() ? list.get(i17) : "";
    }

    @Override // p51.b
    public int getItemsCount() {
        return this.f343083a.size();
    }
}
