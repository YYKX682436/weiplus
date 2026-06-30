package jq0;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f301047a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f301048b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f301049c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f301050d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f301051e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f301052f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f301053g;

    public c(java.lang.String bizName, java.util.List mbJsApiList, java.lang.String frameSetName, java.lang.String frameSetData, android.view.ViewGroup containerView, java.lang.String frameSetRootName, java.util.HashSet hashSet, int i17, kotlin.jvm.internal.i iVar) {
        hashSet = (i17 & 64) != 0 ? null : hashSet;
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(mbJsApiList, "mbJsApiList");
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        kotlin.jvm.internal.o.g(frameSetData, "frameSetData");
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(frameSetRootName, "frameSetRootName");
        this.f301047a = bizName;
        this.f301048b = mbJsApiList;
        this.f301049c = frameSetName;
        this.f301050d = frameSetData;
        this.f301051e = containerView;
        this.f301052f = frameSetRootName;
        this.f301053g = hashSet;
    }
}
