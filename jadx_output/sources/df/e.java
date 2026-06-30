package df;

/* loaded from: classes7.dex */
public final class e implements com.tencent.skyline.jni.SkylineCronetClientInterface {
    @Override // com.tencent.skyline.jni.SkylineCronetClientInterface
    public void StartCronetHttpTask(int i17, java.lang.String url, java.util.HashMap headers) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(headers, "headers");
        df.n.f229517a.a(i17, url, headers);
    }
}
