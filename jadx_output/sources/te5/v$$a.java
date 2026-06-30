package te5;

/* loaded from: classes9.dex */
public final /* synthetic */ class v$$a implements java.util.function.Function {
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        android.view.MenuItem menuItem = (android.view.MenuItem) obj;
        return java.lang.String.valueOf(te5.v.c(menuItem != null ? menuItem.getItemId() : -1));
    }
}
