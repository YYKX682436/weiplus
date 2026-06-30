package com.tencent.mm.wexnet;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/wexnet/Result;", "", ya.b.SUCCESS, "", "codes", "", "desc", "", "", "(Z[J[Ljava/lang/String;)V", "getCodes", "()[J", "getDesc", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getSuccess", "()Z", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public class Result {
    private final long[] codes;
    private final java.lang.String[] desc;
    private final boolean success;

    public Result(boolean z17, long[] codes, java.lang.String[] desc) {
        kotlin.jvm.internal.o.g(codes, "codes");
        kotlin.jvm.internal.o.g(desc, "desc");
        this.success = z17;
        this.codes = codes;
        this.desc = desc;
    }

    public final long[] getCodes() {
        return this.codes;
    }

    public final java.lang.String[] getDesc() {
        return this.desc;
    }

    public final boolean getSuccess() {
        return this.success;
    }
}
