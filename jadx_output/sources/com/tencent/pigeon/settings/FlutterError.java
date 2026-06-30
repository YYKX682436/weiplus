package com.tencent.pigeon.settings;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/tencent/pigeon/settings/FlutterError;", "", "code", "", com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "details", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getCode", "()Ljava/lang/String;", "getDetails", "()Ljava/lang/Object;", "getMessage", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FlutterError extends java.lang.Throwable {
    private final java.lang.String code;
    private final java.lang.Object details;
    private final java.lang.String message;

    public /* synthetic */ FlutterError(java.lang.String str, java.lang.String str2, java.lang.Object obj, int i17, kotlin.jvm.internal.i iVar) {
        this(str, (i17 & 2) != 0 ? null : str2, (i17 & 4) != 0 ? null : obj);
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    public final java.lang.Object getDetails() {
        return this.details;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        return this.message;
    }

    public FlutterError(java.lang.String code, java.lang.String str, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(code, "code");
        this.code = code;
        this.message = str;
        this.details = obj;
    }
}
