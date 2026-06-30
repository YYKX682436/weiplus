package fs2;

/* loaded from: classes2.dex */
public interface c {
    com.tencent.mm.ui.MMFragmentActivity getActivity();

    default android.content.res.Resources getResources() {
        android.content.res.Resources resources = getActivity().getResources();
        kotlin.jvm.internal.o.d(resources);
        return resources;
    }
}
