package oi1;

/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f345603a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f345604b;

    public l(java.lang.String dialogContent, java.util.List sceneInfo) {
        kotlin.jvm.internal.o.g(dialogContent, "dialogContent");
        kotlin.jvm.internal.o.g(sceneInfo, "sceneInfo");
        this.f345603a = dialogContent;
        this.f345604b = sceneInfo;
    }

    public final boolean a(java.lang.String scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        for (oi1.m mVar : this.f345604b) {
            if (android.text.TextUtils.equals(mVar.f345606b, scene) && mVar.f345605a) {
                return true;
            }
        }
        return false;
    }
}
