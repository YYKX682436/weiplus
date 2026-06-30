package jz5;

/* loaded from: classes10.dex */
public final class k extends java.lang.Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String message) {
        super(message);
        kotlin.jvm.internal.o.g(message, "message");
    }

    public /* synthetic */ k(java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? "An operation is not implemented." : str);
    }
}
