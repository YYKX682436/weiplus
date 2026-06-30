package lq;

/* loaded from: classes8.dex */
public interface b {
    boolean isInitCrash();

    void markDrawEndPoint();

    void markDrawStartPoint();

    void markWillCrash();

    boolean needMarkDrawPoint();

    void onInitCrash();

    void onInitEnd();

    boolean willCrash();
}
