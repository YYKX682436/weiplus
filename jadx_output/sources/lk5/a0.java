package lk5;

/* loaded from: classes14.dex */
public final class a0 {
    public a0(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.ui.vas.VASCommonFragment a(android.content.Intent inputIntent, java.lang.Class cls) {
        kotlin.jvm.internal.o.g(inputIntent, "inputIntent");
        kotlin.jvm.internal.o.g(cls, "cls");
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = (com.tencent.mm.ui.vas.VASCommonFragment) cls.newInstance();
        android.os.Bundle extras = inputIntent.getExtras();
        android.os.Bundle bundle = new android.os.Bundle();
        if (extras != null) {
            extras.setClassLoader(cls.getClassLoader());
            bundle.putAll(extras);
        }
        vASCommonFragment.setArguments(bundle);
        vASCommonFragment.A.setComponent(inputIntent.getComponent());
        return vASCommonFragment;
    }
}
