package mx0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ mx0.n[] f332161d;

    static {
        mx0.n[] nVarArr = {new mx0.n("kFinderAiTaskRetCodeNormal", 0, 0), new mx0.n("kFinderAiTaskRetCodeCancel", 1, com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ILLEGAL), new mx0.n("kFinderAiTaskRetCodeBan", 2, 40001), new mx0.n("kFinderAiTaskRetCodeFailed", 3, com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ALWAYS_RETURN_TRY_AGAIN), new mx0.n("kFinderAiTaskRetCodeTimeout", 4, 40003), new mx0.n("kFinderAiTaskRetCodeSpam", 5, 40004), new mx0.n("kFinderAiTaskRetCodeNoFace", 6, 40005)};
        f332161d = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17, int i18) {
    }

    public static mx0.n valueOf(java.lang.String str) {
        return (mx0.n) java.lang.Enum.valueOf(mx0.n.class, str);
    }

    public static mx0.n[] values() {
        return (mx0.n[]) f332161d.clone();
    }
}
