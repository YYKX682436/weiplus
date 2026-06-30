package kp3;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f310992a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.youtu.YTBizPalmRegister.ImageDataResult f310993b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.youtu.YTBizPalmRegister.ImageDataResult f310994c;

    public h(java.lang.String str, com.tencent.youtu.YTBizPalmRegister.ImageDataResult imageDataResult, com.tencent.youtu.YTBizPalmRegister.ImageDataResult imageDataResult2) {
        this.f310992a = str;
        this.f310993b = imageDataResult;
        this.f310994c = imageDataResult2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp3.h)) {
            return false;
        }
        kp3.h hVar = (kp3.h) obj;
        return kotlin.jvm.internal.o.b(this.f310992a, hVar.f310992a) && kotlin.jvm.internal.o.b(this.f310993b, hVar.f310993b) && kotlin.jvm.internal.o.b(this.f310994c, hVar.f310994c);
    }

    public int hashCode() {
        java.lang.String str = this.f310992a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        com.tencent.youtu.YTBizPalmRegister.ImageDataResult imageDataResult = this.f310993b;
        int hashCode2 = (hashCode + (imageDataResult == null ? 0 : imageDataResult.hashCode())) * 31;
        com.tencent.youtu.YTBizPalmRegister.ImageDataResult imageDataResult2 = this.f310994c;
        return hashCode2 + (imageDataResult2 != null ? imageDataResult2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "YTRegisterResult(jsonResult=" + this.f310992a + ", registerImg=" + this.f310993b + ", liveNessImg=" + this.f310994c + ')';
    }
}
