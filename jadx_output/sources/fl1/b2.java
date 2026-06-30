package fl1;

/* loaded from: classes14.dex */
public interface b2 extends android.content.DialogInterface {
    boolean a();

    boolean d();

    android.view.View getContentView();

    int getPosition();

    boolean j();

    void m();

    default boolean n() {
        return true;
    }

    void onCancel();

    default boolean q() {
        return true;
    }

    void v(fl1.g2 g2Var);

    void y(int i17);
}
