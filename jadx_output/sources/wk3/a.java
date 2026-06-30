package wk3;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final wk3.a f446957a = new wk3.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f446958b = kz5.o1.c("com.tencent.mm.plugin.finder.feed.ui.FinderNewStyleTimelineUI");

    public final int a(int i17) {
        if (i17 == 1) {
            return com.tencent.mm.R.raw.biz_mini_program_circle_regular;
        }
        if (i17 == 2) {
            return com.tencent.mm.R.raw.link_regular;
        }
        if (i17 == 3) {
            return com.tencent.mm.R.raw.favorites_regular;
        }
        if (i17 == 4) {
            return com.tencent.mm.R.raw.folder_regular;
        }
        if (i17 == 8) {
            return com.tencent.mm.R.raw.news_regular;
        }
        if (i17 == 29) {
            return com.tencent.mm.R.raw.ask_regular;
        }
        if (i17 == 30) {
            return com.tencent.mm.R.raw.search_regular;
        }
        switch (i17) {
            case 22:
            case 25:
                return com.tencent.mm.R.raw.channels_regular;
            case 23:
                return com.tencent.mm.R.raw.music_regular;
            case 24:
                return com.tencent.mm.R.raw.audio_medium;
            case 26:
                return com.tencent.mm.R.raw.biz_subscriptions_regular;
            case 27:
                return com.tencent.mm.R.raw.news_regular;
            default:
                return com.tencent.mm.R.raw.link_regular;
        }
    }

    public final int b(int i17) {
        if (i17 == 1) {
            return com.tencent.mm.R.raw.biz_mini_program_circle_regular;
        }
        if (i17 == 2) {
            return com.tencent.mm.R.raw.icons_filled_link;
        }
        if (i17 == 3) {
            return com.tencent.mm.R.raw.bottomsheet_icon_fav;
        }
        if (i17 == 4) {
            return com.tencent.mm.R.raw.icons_filled_documentation;
        }
        if (i17 == 8) {
            return com.tencent.mm.R.raw.news_filled;
        }
        if (i17 == 29) {
            return com.tencent.mm.R.raw.ask_filled;
        }
        if (i17 == 30) {
            return com.tencent.mm.R.raw.search_filled;
        }
        switch (i17) {
            case 22:
            case 25:
                return com.tencent.mm.R.raw.icons_filled_channel;
            case 23:
                return com.tencent.mm.R.raw.music_filled;
            case 24:
                return com.tencent.mm.R.raw.audio_filled;
            case 26:
                return com.tencent.mm.R.raw.icon_filled_subscriptions;
            case 27:
                return com.tencent.mm.R.raw.news_filled;
            default:
                return com.tencent.mm.R.raw.icons_filled_link;
        }
    }

    public final java.lang.CharSequence c(android.widget.TextView tv6, java.lang.CharSequence spanText, int i17) {
        kotlin.jvm.internal.o.g(tv6, "tv");
        kotlin.jvm.internal.o.g(spanText, "spanText");
        android.content.Context context = tv6.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        int b17 = i65.a.b(context, (i17 * 12) + 1);
        android.content.Context context2 = tv6.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        int b18 = i65.a.b(context2, ((i17 + 1) * 12) + 1);
        android.text.StaticLayout staticLayout = new android.text.StaticLayout(spanText, 0, spanText.length(), tv6.getPaint(), b17, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (new android.text.StaticLayout(spanText, 0, spanText.length(), tv6.getPaint(), b18, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= 1) {
            return spanText;
        }
        int lineEnd = staticLayout.getLineEnd(0);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context3 = tv6.getContext();
        java.lang.String substring = spanText.toString().substring(0, lineEnd);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        java.lang.String concat = substring.concat("...");
        ((ke0.e) xVar).getClass();
        return com.tencent.mm.pluginsdk.ui.span.c0.i(context3, concat);
    }
}
