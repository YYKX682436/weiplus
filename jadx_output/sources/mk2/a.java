package mk2;

/* loaded from: classes3.dex */
public interface a {
    default void onAcceptMicNewPkTimeout(java.lang.String str) {
    }

    void onAcceptMicTimeout(java.lang.String str);

    void onApplyBattleTimeout();

    default void onApplyMicNewPkTimeout(java.lang.String str) {
    }

    void onApplyMicTimeout();

    void onRandomMatchTimeout();
}
