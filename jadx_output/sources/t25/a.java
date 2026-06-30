package t25;

/* loaded from: classes11.dex */
public interface a {
    boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17);

    boolean R(java.lang.String str);

    default android.view.View S() {
        return null;
    }

    void onActivityResult(int i17, int i18, android.content.Intent intent);

    boolean onDetach();
}
