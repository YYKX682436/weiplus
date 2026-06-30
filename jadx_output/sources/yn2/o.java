package yn2;

/* loaded from: classes2.dex */
public final class o {
    public o(kotlin.jvm.internal.i iVar) {
    }

    public final void a(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, boolean z17) {
        java.lang.String str;
        androidx.appcompat.widget.AppCompatSeekBar appCompatSeekBar;
        boolean z18;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(com.tencent.mm.plugin.finder.storage.FeedData.Companion.a(item).getMediaList());
        if (mb4Var != null) {
            str = ds2.h.f242866a.c(item.getItemId(), mb4Var, false).n();
            float f17 = cu2.x.c(cu2.x.f222449a, str, false, false, false, 14, null).field_playProgress;
            if (f17 <= 0.0f) {
                r45.no2 playhistory_info = item.getFeedObject().getFeedObject().getPlayhistory_info();
                int integer = playhistory_info != null ? playhistory_info.getInteger(0) : 0;
                f17 = (integer <= 0 || mb4Var.getInteger(3) <= 0) ? 0.0f : (integer * 1.0f) / mb4Var.getInteger(3);
            }
            androidx.appcompat.widget.AppCompatSeekBar appCompatSeekBar2 = (androidx.appcompat.widget.AppCompatSeekBar) holder.p(com.tencent.mm.R.id.f487542oy0);
            if (appCompatSeekBar2 != null) {
                appCompatSeekBar2.setProgress(a06.d.b(1000 * f17));
                appCompatSeekBar2.setVisibility(f17 > 0.0f ? 0 : 8);
            }
        } else {
            if (z17 && (appCompatSeekBar = (androidx.appcompat.widget.AppCompatSeekBar) holder.p(com.tencent.mm.R.id.f487542oy0)) != null) {
                appCompatSeekBar.setProgress(0);
                appCompatSeekBar.setVisibility(8);
            }
            str = "";
        }
        java.lang.String str2 = str;
        boolean z19 = true;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z18 = true;
        } else {
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            z18 = false;
        }
        if (!z18 && !z65.c.a()) {
            kb2.b bVar = kb2.b.f306225a;
            z19 = false;
        }
        if (z19) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setPlayProgress force=");
            sb6.append(z17);
            sb6.append(", cachePlayProgress=");
            sb6.append(cu2.x.c(cu2.x.f222449a, str2, false, false, false, 14, null).field_playProgress);
            sb6.append(",breakPointTimeMs=");
            r45.no2 playhistory_info2 = item.getFeedObject().getFeedObject().getPlayhistory_info();
            sb6.append(playhistory_info2 != null ? java.lang.Integer.valueOf(playhistory_info2.getInteger(0)) : null);
            sb6.append(",videoDuration=");
            sb6.append(mb4Var != null ? java.lang.Integer.valueOf(mb4Var.getInteger(3)) : null);
            com.tencent.mars.xlog.Log.i("Finder.MegaVideo.SeeLaterCardConvert", sb6.toString());
        }
    }
}
