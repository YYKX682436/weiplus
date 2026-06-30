package fv3;

/* loaded from: classes5.dex */
public abstract class a implements fv3.b {

    /* renamed from: d, reason: collision with root package name */
    public final fv3.c f266982d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f266983e;

    public a(fv3.c status, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        str = (i17 & 2) != 0 ? null : str;
        kotlin.jvm.internal.o.g(status, "status");
        this.f266982d = status;
        this.f266983e = str;
        ((com.tencent.mm.plugin.recordvideo.ui.editor.music.component.base.AbsMusicPickerAutoRegisterComponentLayout) status).pluginList.add(this);
    }

    @Override // fv3.b
    public java.lang.String name() {
        java.lang.String str = this.f266983e;
        return android.text.TextUtils.isEmpty(str) ? getClass().getName() : str;
    }
}
