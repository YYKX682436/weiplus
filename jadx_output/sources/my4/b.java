package my4;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final my4.b f332848d = new my4.b();

    public b() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.CheckBox checkBox;
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.view.ViewGroup viewGroup = it instanceof android.view.ViewGroup ? (android.view.ViewGroup) it : null;
        return java.lang.Boolean.valueOf((viewGroup == null || (checkBox = (android.widget.CheckBox) viewGroup.findViewById(com.tencent.mm.R.id.a9h)) == null) ? false : checkBox.isChecked());
    }
}
