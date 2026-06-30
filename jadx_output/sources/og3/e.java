package og3;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.modelcontrol.VideoTransPara f345161a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f345162b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f345163c;

    public e(com.tencent.mm.modelcontrol.VideoTransPara videoParams, java.util.ArrayList outputs, android.os.Bundle bundle, int i17, kotlin.jvm.internal.i iVar) {
        bundle = (i17 & 4) != 0 ? null : bundle;
        kotlin.jvm.internal.o.g(videoParams, "videoParams");
        kotlin.jvm.internal.o.g(outputs, "outputs");
        this.f345161a = videoParams;
        this.f345162b = outputs;
        this.f345163c = bundle;
    }

    public final java.lang.String a() {
        java.lang.Object obj;
        java.util.Iterator it = this.f345162b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo) obj).f148609d == og3.a.f345157f) {
                break;
            }
        }
        com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo mediaSingleInfo = (com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo) obj;
        if (mediaSingleInfo != null) {
            return mediaSingleInfo.f148610e;
        }
        return null;
    }

    public final java.lang.String b() {
        java.lang.Object obj;
        java.util.Iterator it = this.f345162b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo) obj).f148609d == og3.a.f345155d) {
                break;
            }
        }
        com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo mediaSingleInfo = (com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo) obj;
        if (mediaSingleInfo != null) {
            return mediaSingleInfo.f148610e;
        }
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og3.e)) {
            return false;
        }
        og3.e eVar = (og3.e) obj;
        return kotlin.jvm.internal.o.b(this.f345161a, eVar.f345161a) && kotlin.jvm.internal.o.b(this.f345162b, eVar.f345162b) && kotlin.jvm.internal.o.b(this.f345163c, eVar.f345163c);
    }

    public int hashCode() {
        int hashCode = ((this.f345161a.hashCode() * 31) + this.f345162b.hashCode()) * 31;
        android.os.Bundle bundle = this.f345163c;
        return hashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    public java.lang.String toString() {
        return "MediaOutputInfo(videoParams=" + this.f345161a + ", outputs=" + this.f345162b + ", extra=" + this.f345163c + ')';
    }
}
