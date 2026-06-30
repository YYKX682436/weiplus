package do2;

/* loaded from: classes10.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final android.util.Size a(android.content.res.Resources resource, do2.e type) {
        kotlin.jvm.internal.o.g(resource, "resource");
        kotlin.jvm.internal.o.g(type, "type");
        int ordinal = type.ordinal();
        return ordinal != 1 ? ordinal != 2 ? (ordinal == 3 || ordinal == 4) ? new android.util.Size(resource.getDimensionPixelOffset(com.tencent.mm.R.dimen.f480502zo), resource.getDimensionPixelOffset(com.tencent.mm.R.dimen.f480501zn)) : new android.util.Size(resource.getDimensionPixelOffset(com.tencent.mm.R.dimen.f480504zq), resource.getDimensionPixelOffset(com.tencent.mm.R.dimen.f480503zp)) : new android.util.Size(resource.getDimensionPixelOffset(com.tencent.mm.R.dimen.f480505zr), resource.getDimensionPixelOffset(com.tencent.mm.R.dimen.f480505zr)) : new android.util.Size(resource.getDimensionPixelOffset(com.tencent.mm.R.dimen.f480500zm), resource.getDimensionPixelOffset(com.tencent.mm.R.dimen.f480499zl));
    }
}
