package th5;

/* loaded from: classes12.dex */
public final class z0 extends bg3.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // bg3.e, bg3.f
    public void S2(mf3.k mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPhotoSaveComponent", "save mediaInfo: " + mediaInfo.getType());
        if (th5.w0.f419473a[mediaInfo.getType().ordinal()] != 1) {
            super.S2(mediaInfo);
            return;
        }
        th5.q qVar = mediaInfo instanceof th5.q ? (th5.q) mediaInfo : null;
        if (qVar == null) {
            return;
        }
        java.lang.String str = qVar.f419454l;
        if (str.length() == 0) {
            str = qVar.f419453k;
        }
        java.lang.String b17 = qVar.b();
        boolean z17 = (str.length() > 0) && com.tencent.mm.vfs.w6.j(str);
        boolean z18 = (b17.length() > 0) && com.tencent.mm.vfs.w6.j(b17);
        if (z17 && z18) {
            kotlinx.coroutines.l.d(androidx.lifecycle.z.a(getActivity()), null, null, new th5.y0(this, str, b17, null), 3, null);
        } else if (z17) {
            super.S2(new th5.l1(qVar));
        } else {
            super.S2(new th5.k1(qVar));
        }
    }
}
